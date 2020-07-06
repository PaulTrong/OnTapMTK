/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRONG
 */
public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;
    
    public HoaDon(Builder builder)
    {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }
    
    public static class Builder
    {
        HoaDonHeader header;
        List<CTHD> cthds;
        public Builder()
        {
            cthds = new ArrayList<>();
        }
        
        public Builder addHeader(HoaDonHeader h)
        {
            this.header =h;
            return this;
        }

        public Builder addCTHD(CTHD cthd) 
        {
            cthds.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
}
