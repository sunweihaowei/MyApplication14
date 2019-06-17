package cn.edu.gdpt.myapplication;

import java.util.List;

public class bean2 {

    /**
     * showapi_res_error :
     * showapi_res_id : aeff6e8bfbbb4a8696937fbe3884206f
     * showapi_res_code : 0
     * showapi_res_body : {"realTimeRank":{"movieRank":[{"boxOffice":"354.55","boxPercent":"32.17","name":"黑衣人：全球追缉","rank":"1","showDay":"4","sumBoxOffice":"18245.19"},{"boxOffice":"179.71","boxPercent":"16.31","name":"最好的我们","rank":"2","showDay":"12","sumBoxOffice":"31209.46"},{"boxOffice":"126.37","boxPercent":"11.47","name":"哥斯拉2：怪兽之王","rank":"3","showDay":"18","sumBoxOffice":"85606.78"},{"boxOffice":"77.51","boxPercent":"7.03","name":"绝杀慕尼黑","rank":"4","showDay":"5","sumBoxOffice":"2266.25"},{"boxOffice":"76.75","boxPercent":"6.96","name":"X战警：黑凤凰","rank":"5","showDay":"12","sumBoxOffice":"38533.59"},{"boxOffice":"64.71","boxPercent":"5.87","name":"秦明·生死语者","rank":"6","showDay":"4","sumBoxOffice":"2083.42"},{"boxOffice":"56.22","boxPercent":"5.10","name":"妈阁是座城","rank":"7","showDay":"4","sumBoxOffice":"2766.81"},{"boxOffice":"40.13","boxPercent":"3.64","name":"追龙Ⅱ","rank":"8","showDay":"12","sumBoxOffice":"26874.77"},{"boxOffice":"38.22","boxPercent":"3.47","name":"阿拉丁","rank":"9","showDay":"25","sumBoxOffice":"35747.43"},{"boxOffice":"17.37","boxPercent":"1.58","name":"千与千寻","rank":"10","showDay":"-3","sumBoxOffice":"158.87"},{"boxOffice":"70.50","boxPercent":"1.00","name":"其它","rank":"11","showDay":"0","sumBoxOffice":"0.00"}],"realTimeBoxOffice":"1102.0"},"remark":"查询成功！","ret_code":"0"}
     */

    private String showapi_res_error;
    private String showapi_res_id;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * realTimeRank : {"movieRank":[{"boxOffice":"354.55","boxPercent":"32.17","name":"黑衣人：全球追缉","rank":"1","showDay":"4","sumBoxOffice":"18245.19"},{"boxOffice":"179.71","boxPercent":"16.31","name":"最好的我们","rank":"2","showDay":"12","sumBoxOffice":"31209.46"},{"boxOffice":"126.37","boxPercent":"11.47","name":"哥斯拉2：怪兽之王","rank":"3","showDay":"18","sumBoxOffice":"85606.78"},{"boxOffice":"77.51","boxPercent":"7.03","name":"绝杀慕尼黑","rank":"4","showDay":"5","sumBoxOffice":"2266.25"},{"boxOffice":"76.75","boxPercent":"6.96","name":"X战警：黑凤凰","rank":"5","showDay":"12","sumBoxOffice":"38533.59"},{"boxOffice":"64.71","boxPercent":"5.87","name":"秦明·生死语者","rank":"6","showDay":"4","sumBoxOffice":"2083.42"},{"boxOffice":"56.22","boxPercent":"5.10","name":"妈阁是座城","rank":"7","showDay":"4","sumBoxOffice":"2766.81"},{"boxOffice":"40.13","boxPercent":"3.64","name":"追龙Ⅱ","rank":"8","showDay":"12","sumBoxOffice":"26874.77"},{"boxOffice":"38.22","boxPercent":"3.47","name":"阿拉丁","rank":"9","showDay":"25","sumBoxOffice":"35747.43"},{"boxOffice":"17.37","boxPercent":"1.58","name":"千与千寻","rank":"10","showDay":"-3","sumBoxOffice":"158.87"},{"boxOffice":"70.50","boxPercent":"1.00","name":"其它","rank":"11","showDay":"0","sumBoxOffice":"0.00"}],"realTimeBoxOffice":"1102.0"}
         * remark : 查询成功！
         * ret_code : 0
         */

        private RealTimeRankBean realTimeRank;
        private String remark;
        private String ret_code;

        public RealTimeRankBean getRealTimeRank() {
            return realTimeRank;
        }

        public void setRealTimeRank(RealTimeRankBean realTimeRank) {
            this.realTimeRank = realTimeRank;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRet_code() {
            return ret_code;
        }

        public void setRet_code(String ret_code) {
            this.ret_code = ret_code;
        }

        public static class RealTimeRankBean {
            /**
             * movieRank : [{"boxOffice":"354.55","boxPercent":"32.17","name":"黑衣人：全球追缉","rank":"1","showDay":"4","sumBoxOffice":"18245.19"},{"boxOffice":"179.71","boxPercent":"16.31","name":"最好的我们","rank":"2","showDay":"12","sumBoxOffice":"31209.46"},{"boxOffice":"126.37","boxPercent":"11.47","name":"哥斯拉2：怪兽之王","rank":"3","showDay":"18","sumBoxOffice":"85606.78"},{"boxOffice":"77.51","boxPercent":"7.03","name":"绝杀慕尼黑","rank":"4","showDay":"5","sumBoxOffice":"2266.25"},{"boxOffice":"76.75","boxPercent":"6.96","name":"X战警：黑凤凰","rank":"5","showDay":"12","sumBoxOffice":"38533.59"},{"boxOffice":"64.71","boxPercent":"5.87","name":"秦明·生死语者","rank":"6","showDay":"4","sumBoxOffice":"2083.42"},{"boxOffice":"56.22","boxPercent":"5.10","name":"妈阁是座城","rank":"7","showDay":"4","sumBoxOffice":"2766.81"},{"boxOffice":"40.13","boxPercent":"3.64","name":"追龙Ⅱ","rank":"8","showDay":"12","sumBoxOffice":"26874.77"},{"boxOffice":"38.22","boxPercent":"3.47","name":"阿拉丁","rank":"9","showDay":"25","sumBoxOffice":"35747.43"},{"boxOffice":"17.37","boxPercent":"1.58","name":"千与千寻","rank":"10","showDay":"-3","sumBoxOffice":"158.87"},{"boxOffice":"70.50","boxPercent":"1.00","name":"其它","rank":"11","showDay":"0","sumBoxOffice":"0.00"}]
             * realTimeBoxOffice : 1102.0
             */

            private String realTimeBoxOffice;
            private List<MovieRankBean> movieRank;

            public String getRealTimeBoxOffice() {
                return realTimeBoxOffice;
            }

            public void setRealTimeBoxOffice(String realTimeBoxOffice) {
                this.realTimeBoxOffice = realTimeBoxOffice;
            }

            public List<MovieRankBean> getMovieRank() {
                return movieRank;
            }

            public void setMovieRank(List<MovieRankBean> movieRank) {
                this.movieRank = movieRank;
            }

            public static class MovieRankBean {
                /**
                 * boxOffice : 354.55
                 * boxPercent : 32.17
                 * name : 黑衣人：全球追缉
                 * rank : 1
                 * showDay : 4
                 * sumBoxOffice : 18245.19
                 */

                private String boxOffice;
                private String boxPercent;
                private String name;
                private String rank;
                private String showDay;
                private String sumBoxOffice;

                public String getBoxOffice() {
                    return boxOffice;
                }

                public void setBoxOffice(String boxOffice) {
                    this.boxOffice = boxOffice;
                }

                public String getBoxPercent() {
                    return boxPercent;
                }

                public void setBoxPercent(String boxPercent) {
                    this.boxPercent = boxPercent;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getRank() {
                    return rank;
                }

                public void setRank(String rank) {
                    this.rank = rank;
                }

                public String getShowDay() {
                    return showDay;
                }

                public void setShowDay(String showDay) {
                    this.showDay = showDay;
                }

                public String getSumBoxOffice() {
                    return sumBoxOffice;
                }

                public void setSumBoxOffice(String sumBoxOffice) {
                    this.sumBoxOffice = sumBoxOffice;
                }
            }
        }
    }
}
