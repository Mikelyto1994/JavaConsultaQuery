package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
<<<<<<< HEAD
        OpenAiService service = new OpenAiService("TU-APIKEY-OPENIA");
=======
        OpenAiService service = new OpenAiService("");
>>>>>>> fd6bc0f039112b771cbb8c2f2a2cbb8c1c6dbeb9


        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}
