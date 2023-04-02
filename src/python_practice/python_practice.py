"""
# 식단계산 프로그램
menu = { "샐러드" : 900, "떡볶이" : 1000, "피자": 2000, "고구마": 85} # 딕셔너리형으로 menu를 만듬
menu_sum = 0                                                        # 총 칼로리

for item in menu :                                                  # 메뉴판 출력
    print("\n%s\t칼로리 : %d"%(item,menu[item]))                     

print("\n위 메뉴판을 보고 오늘 하루 드실 메뉴를 입력해주세요, 더이상 입력할 메뉴가 없다면 'N' 입력 ") 

# 계속 입력 받아야 해서 무한루프를 돌림
while True : 

    answer = input("\n메뉴를 입력하세요. 'n' or 'N'을 입력하면 메뉴입력이 완료됩니다. : ")

    # 입력받은 메뉴들의 칼로리를 더함
    if answer == '샐러드' : 
        menu_sum = menu_sum + menu["샐러드"]
        print ("샐러드를 입력하셨습니다")
    
    elif answer == "떡볶이" : 
        menu_sum = menu_sum + menu["떡볶이"]
        print ("떡볶이를 입력하셨습니다")

    elif answer == "피자" : 
        menu_sum = menu_sum + menu["피자"]
        print ("피자를 입력하셨습니다")

    elif answer == "고구마" : 
        menu_sum = menu_sum + menu["고구마"]
        print ("고구마를 입력하셨습니다")
    
    # n이나 N 입력 시 while문 탈출!
    elif answer == "n" or "N":
        break

# 0일때 2000 이하일때 2000이상일때 각각 메시지 출력
if menu_sum == 0 :
    print("\n굶지 마세요") 
elif menu_sum > 2000 :
    print ("\n현재칼로리 :" , menu_sum, "하루 권장 칼로리를 초과하였습니다")
elif menu_sum <= 2000 :
    print ("\n현재칼로리 :" , menu_sum, "맛있게 드세요")
"""

"""
# 베스킨 라빈스 31게임입니다.
print("\n게임을 시작하자!!\n")

final = 1 # 마지막 숫자 

# 31이 될때까지 입력 받아야해서 무한 루프를 돌림
while True :
    count = int(input('숫자 몇 개를 부를 건가요? (1~3): ')) # 부를 숫자를 입력함

    for i in range(count) : 
        print(final + i)    # 입력한 숫자만큼 출력

    final = final + count   # 중첩되서 더해지기 때문에 숫자에 입력한 숫자를 더함

    if final == 32 : # 31까지 출력하기 위해서 조건을 32로 함.
        print("벌칙당첨")
        break
"""
while True :
    base = float(input("삼각형의 밑변을 입력하시오 : "))
    height = float(input("삼각형의 높이을 입력하시오 : "))
    area = (base * height) / 2
    print("삼각형의 넓이 : ", area)

    if (base > height):
        if (base - height >= 20.5) :
            break
    elif (height > base):
        if (height - base >= 20.5) :
            break
