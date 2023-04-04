package programmers_01;

public class Programmers01 {
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
        public int[] solution(String[] park, String[] routes) {
            int[] answer = new int[2];
            int sx = 0;
            int sy = 0;
            char[][] parking = new char[park.length][park[0].length()];

            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    parking[i][j] = park[i].charAt(j);

                    if (park[i].charAt(j) == "S") {
                        sx = i;
                        sy = j;
                    }
                }
            }

            for (int i = 0; i < routes.length; i++) {
                switch (routes[i].split(" ")[0]) {
                    case "E" : {
                        if (parking[Integer.parseInt(routes[i].split(" ")[0])][sy] == "O") {
                            for (int i = 0; i < routes[i].split(" ")[1]; i++) {
                                sx++;
                            }
                        }
                    }
                    case "W" : {
                        if (parking[routes[i].split(" ")[0]][sy] == "O") {
                            for (int i = 0; i < routes[i].split(" ")[1]; i++) {
                                sx--;
                            }
                        }
                    }
                    case "S" : {
                        if (parking[sx][routes[i].split(" ")[0]] == "O") {
                            for (int i = 0; i < routes[i].split(" ")[1]; i++) {
                                sy++;
                            }
                        }
                    }
                    case "N" : {
                        if (parking[sx][routes[i].split(" ")[0]] == "O") {
                            for (int i = 0; i < routes[i].split(" ")[1]; i++) {
                                sy--;
                            }
                        }
                    }
                }
            }
            answer[0] = sx;
            answer[1] = sy;
            return answer;
        }
}
