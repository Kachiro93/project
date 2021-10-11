package com.example.asproclaud;

import com.example.asproclaud.ui.model.root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.chromium.base.task.AsyncTask;

import java.net.URL;

public class GsonPars  {



    String jsonText = "{\"id\":1,\"title\":\"titllfgbsyjhifgvjhvgsrfgb\"},{\"id\":2,\"title\":\"title2dafsdgbsgSDvSdrfbsgbs\"},{\"id\":3,\"title\":\"titllsdfaasfsfsgbsgaasrfgb\"},{\"id\":4,\"title\":\"titllsdfsfsfsgbsssgsrfgb\"},{\"id\":5,\"title\":\"titllsdfsfsfsgbsgwwsrfgb\"},{\"id\":6,\"title\":\"titllsdfsfsfsgbsgffsrfgb\"},{\"id\":7,\"title\":\"titllsdfsfsfsgbsgsrfgb\"},{\"id\":8,\"title\":\"titllsdfsfsfsgbsgsrfgb\"},{\"id\":9,\"title\":\"titllsdfsfsfsgbsgsrfgb\"},{\"id\":10,\"title\":\"titllsdfsfsfsgbsgsrfgb\"},{\"id\":11,\"title\":\"titllsdfsfsfsgbsgsrfgb\"},{\"id\":12,\"title\":\"titllsdfsfsfsgbsgsSDVrfgb\"},{\"id\":13,\"title\":\"titllsdfsfzdfvsfsgbsgsSDVrfgb\"},{\"id\":14,\"title\":\"titllsdfsffdbsfsgbsgsSDVrfgb\"},{\"id\":15,\"title\":\"titllsdfsfsfgbxfgfsgbsgsSDVrfgb\"},{\"id\":16,\"title\":\"titllsdxfgbxfgbfsfsfsgbsgsSDVrfgb\"},{\"id\":17,\"title\":\"titllzdfbzdfbzdfsdfsfsfsgbsgsSDVrfgb\"},{\"id\":18,\"title\":\"titllsdfsdfzbzdfbzdfbfsfsgbsgsSDVrfgb\"},{\"id\":19,\"title\":\"titllsdfsfsfsgbsSDvSDvSDvSgsSDVrfgb\"},{\"id\":20,\"title\":\"titllsdfsfsfsgbsSDvSDvSDvSgsSDzdfbzdfbzdfbVrfgb\"}";

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    root json = gson.fromJson(jsonText, root.class);

}
