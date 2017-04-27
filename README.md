## numMagic
# Use Api by Url https://api.random.org/json-rpc/1/invoke 
# Create Model for Post follow json 

###### Data Post ######
{
    "jsonrpc": "2.0",
    "method": "generateIntegers",
    "params": {
        "apiKey": "8a107d4d-8dc4-43b4-9386-690c5ef0b0c2",
        "n": 1,
        "min": 1000,
        "max": 9999,
        "replacement": true
    },
    "id": 1
}

------------------------------
###### Data Response ######
{
"jsonrpc": "2.0",
"result":{
"random":{
"data":[
2023
],
"completionTime": "2017-04-25 11:49:21Z"
},
"bitsUsed": 13,
"bitsLeft": 249945,
"requestsLeft": 996,
"advisoryDelay": 130
},
"id": 1
}

### Use Retrofit Libary for connect Api #
 OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient client = builder.build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).client(client)
                .build();

![Alt text](https://github.com/nilezia/numMagic/blob/master/Screenshot_1493262808_framed.png "Optional title")
