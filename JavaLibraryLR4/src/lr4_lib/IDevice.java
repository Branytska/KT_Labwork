/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr4_lib;

/**
 *
 * @author brani
 */
public interface IDevice {
    void Add(Device d);
    void Delete(int id);
    void Change(int id, Device d);
}
