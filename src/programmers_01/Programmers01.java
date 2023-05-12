package programmers_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Programmers01 {
    public static void main(String[] args) {
        /* 프로그래머스 1단계 공원 산책 */
        //String[] park = new String[]{"OSO","OOO","OXO","OOO"};
        //String[] routes = new String[]{"E 2","S 3","W 1"};
        //System.out.print(Arrays.toString(solution2(park, routes)));

        /* 프로그래머스 1단계 달리기경주 */
        //String[] players = new String[]{"mumu","soe","poe","kai","mine"};
        //String[] callings = new String[]{"kai","kai","mine","mine"};
        //System.out.print(Arrays.toString(solution(players,callings)));
        /* 프로그래머스 1단계 이상한 문자 만들기 */
        //String s = "try hello world";

        /* 프로그래머스 1단계 카드뭉치 */
        String[] cards1 = new String[]{"i","drink","water"};
        String[] cards2 = new String[]{"want","to"};
        String[] goal = new String[]{"i","want","to","drink","water"};

        System.out.print(solution(cards1,cards2,goal));
    }

    /* 프로그래머스 1단계 카드뭉치 */
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";


        return answer;
    }

    /* 프로그래머스 1단계 이상한 문자 만들기 */
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0; //인덱스

        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);

            if(str[i].equals(" ")) { //띄어쓰기 있다면
                idx = 0; //인덱스 0 초기화
            }
            else if(idx % 2 == 0) { //idx가 짝수면
                str[i] = str[i].toUpperCase(); //대문자로 변경
                idx++; //idx 증가
            }
            else if(idx % 2 != 0) { //idx가 홀수면
                str[i] = str[i].toLowerCase(); //소문자로 변경
                idx++; //idx 증가
            }
            answer += str[i];
        }
        return answer;
    }

    /* 프로그래머스 1단계 달리기경주 */
    public static String[] solution(String[] players, String[] callings) {
        /* 시간초과
        String[] answer = players;

        String temp = "";

        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (callings[i].equals(answer[j])) {
                    // swap 로직
                    temp = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = temp;

                    break;
                }
            }
        }
        */

        /* hashmap 사용 */
        String[] answer = players.clone();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        int tempN;
        String tempS;

        for (int i = 0; i < callings.length; i++){
            tempN = map.get(callings[i]);

            map.put(answer[tempN], map.get(answer[tempN]) - 1);
            map.put(answer[tempN - 1], map.get(answer[tempN - 1]) + 1);

            tempS = answer[tempN];
            answer[tempN] = answer[tempN - 1];
            answer[tempN - 1] = tempS;
        }

        return answer;
    }

    /* 프로그래머스 1단계 추억점수*/
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }

    /* 프로그래머스 1단계 공원 산책 */
    public static int[] solution2(String[] park, String[] routes) {
        int[] answer = new int[2];
        int sx = 0;
        int sy = 0;
        char[][] parking = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                parking[i][j] = park[i].charAt(j);

                if (park[i].contains("S")) {
                    sy = i;
                    sx = park[i].indexOf("S");
                }

                /*
                    if (park[i].charAt(j) == 'S') {
                        sx = j;
                        sy = i;
                    }
                */
            }
        }

        int x = sx;
        int y = sy;

        Loop1 :
        for (int i = 0; i < routes.length; i++) {
            System.out.println(""+sx+"/"+sy);
            Loop2 :
            for (int j = 1; j <= Integer.parseInt(routes[i].split("")[2]); j++) {
                switch (routes[i].split("")[0]) {
                    case "E" : {
                        System.out.println("E");
                        if (sx + Integer.parseInt(routes[i].split("")[2]) >= park[0].length()) {
                            break Loop2;
                        } else {
                            if (parking[sy][sx+j] == 'X') {
                                x = sx;
                                break Loop2;
                            } else {
                                x++;
                                break;
                            }
                        }
                    }
                    case "W" : {
                        System.out.println("W");
                        if (sx - Integer.parseInt(routes[i].split("")[2]) < 0) {
                            break Loop2;
                        } else {
                            if (parking[sy][sx-j] == 'X') {
                                x = sx;
                                break Loop2;
                            } else {
                                x--;
                                break;
                            }
                        }
                    }
                    case "S" : {
                        System.out.println("S");
                        if (sy + Integer.parseInt(routes[i].split("")[2]) >= park.length) {
                            break Loop2;
                        } else {
                            if (parking[sy+j][sx] == 'X') {
                                y = sy;
                                break Loop2;
                            } else {
                                y++;
                                break;
                            }
                        }
                    }
                    case "N" : {
                        System.out.println("N");
                        if (sy - Integer.parseInt(routes[i].split("")[2]) < 0) {
                            break Loop2;
                        } else {
                            if (parking[sy-j][sx] == 'X') {
                                y = sy;
                                break Loop2;
                            } else {
                                y--;
                                break;
                            }
                        }
                    }
                }
            }

            sx = x;
            sy = y;
        }

        answer[0] = sy;
        answer[1] = sx;
        return answer;
    }
}
