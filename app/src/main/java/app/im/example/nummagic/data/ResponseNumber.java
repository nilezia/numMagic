package app.im.example.nummagic.data;

import java.util.List;

/**
 * Created by Nougat on 4/25/2017.
 */

public class ResponseNumber {

    /**
     * jsonrpc : 2.0
     * result : {"random":{"data":[2023],"completionTime":"2017-04-25 11:49:21Z"},"bitsUsed":13,"bitsLeft":249945,"requestsLeft":996,"advisoryDelay":130}
     * id : 1
     */

    private String jsonrpc;
    private ResultBean result;
    private int id;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class ResultBean {
        /**
         * random : {"data":[2023],"completionTime":"2017-04-25 11:49:21Z"}
         * bitsUsed : 13
         * bitsLeft : 249945
         * requestsLeft : 996
         * advisoryDelay : 130
         */

        private RandomBean random;
        private int bitsUsed;
        private int bitsLeft;
        private int requestsLeft;
        private int advisoryDelay;

        public RandomBean getRandom() {
            return random;
        }

        public void setRandom(RandomBean random) {
            this.random = random;
        }

        public int getBitsUsed() {
            return bitsUsed;
        }

        public void setBitsUsed(int bitsUsed) {
            this.bitsUsed = bitsUsed;
        }

        public int getBitsLeft() {
            return bitsLeft;
        }

        public void setBitsLeft(int bitsLeft) {
            this.bitsLeft = bitsLeft;
        }

        public int getRequestsLeft() {
            return requestsLeft;
        }

        public void setRequestsLeft(int requestsLeft) {
            this.requestsLeft = requestsLeft;
        }

        public int getAdvisoryDelay() {
            return advisoryDelay;
        }

        public void setAdvisoryDelay(int advisoryDelay) {
            this.advisoryDelay = advisoryDelay;
        }

        public static class RandomBean {
            /**
             * data : [2023]
             * completionTime : 2017-04-25 11:49:21Z
             */

            private String completionTime;
            private List<Integer> data;

            public String getCompletionTime() {
                return completionTime;
            }

            public void setCompletionTime(String completionTime) {
                this.completionTime = completionTime;
            }

            public List<Integer> getData() {
                return data;
            }

            public void setData(List<Integer> data) {
                this.data = data;
            }
        }
    }
}
