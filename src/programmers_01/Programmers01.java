package programmers_01;

import java.util.Arrays;

public class Programmers01 {
    public static void main(String[] args) {
        String[] park = new String[]{"OSO","OOO","OXO","OOO"};
        String[] routes = new String[]{"E 2","S 3","W 1"};

        System.out.print(Arrays.toString(solution2(park, routes)));
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

                if (park[i].charAt(j) == 'S') {
                    sx = j;
                    sy = i;
                }
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
