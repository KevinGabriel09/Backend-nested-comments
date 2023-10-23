package com.discusion.foroPrueba.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.springframework.stereotype.Service;

import com.discusion.foroPrueba.models.DtoResponse;
import com.discusion.foroPrueba.models.Foro;
import com.google.gson.Gson;


@Service
public class ForoService {

	public DtoResponse guardarInfoForo (Foro dataForo) {
		DtoResponse resp = new DtoResponse(false, "");
		Gson json = new Gson();
		String strJson = json.toJson(dataForo);
		
		try {
			
			File fileJson = new File(Thread.currentThread().getContextClassLoader().getResource("dataForo.json").getFile());
			
			saveDataToJson(fileJson, strJson);
			
			resp.setExito(true);
			resp.setMsg("Guardado exitoso");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return resp;
	}
	
	private void saveDataToJson(File archivo, String strJson) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo));
            bufferedWriter.write(strJson);
            bufferedWriter.flush();
            bufferedWriter.close();
		}catch(Exception ex) {
			
		}
	}
	
}
