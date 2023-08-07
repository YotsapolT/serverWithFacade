package serverwofacade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tong
 */
public class FacadeForServer {
    ScheduleServer scheServ = new ScheduleServer();
    
    public void StartServer(){
        scheServ.startBooting();
	scheServ.readSystemConfigFile();
	scheServ.init();
	scheServ.initializeContext();
	scheServ.initializeListeners();
	scheServ.createSystemObjects();
	System.out.println("Start working......");
    }
    
    public void StopServer(){
	System.out.println("After work done.........");
	scheServ.releaseProcesses();
	scheServ.destory();
	scheServ.destroySystemObjects();
	scheServ.destoryListeners();
	scheServ.destoryContext();
	scheServ.shutdown();
    }
}
