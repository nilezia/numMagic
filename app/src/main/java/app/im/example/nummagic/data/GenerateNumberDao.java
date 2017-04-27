package app.im.example.nummagic.data;

/**
 * Created by Nougat on 4/25/2017.
 */

public class GenerateNumberDao {
    /**
     * jsonrpc : 2.0
     * method : generateIntegers
     * params : {"apiKey":"8a107d4d-8dc4-43b4-9386-690c5ef0b0c2","n":1,"min":1000,"max":9999,"replacement":true}
     * id : 1
     */

    private String jsonrpc;
    private String method;
    private ParamsBean params;
    private int id;

    public GenerateNumberDao() {
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ParamsBean getParams() {
        return params;
    }

    public void setParams(ParamsBean params) {
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class ParamsBean {
        /**
         * apiKey : 8a107d4d-8dc4-43b4-9386-690c5ef0b0c2
         * n : 1
         * min : 1000
         * max : 9999
         * replacement : true
         */

        private String apiKey;
        private int n;
        private int min;
        private int max;
        private boolean replacement;

        public ParamsBean(String apiKey, int n, int min, int max, boolean replacement) {
            this.apiKey = apiKey;
            this.n = n;
            this.min = min;
            this.max = max;
            this.replacement = replacement;
        }

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public boolean isReplacement() {
            return replacement;
        }

        public void setReplacement(boolean replacement) {
            this.replacement = replacement;
        }
    }
}
