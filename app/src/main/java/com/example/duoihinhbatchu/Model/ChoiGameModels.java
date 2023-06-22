package com.example.duoihinhbatchu.Model;

import com.example.duoihinhbatchu.Activity.ChoiGameActivity;
import com.example.duoihinhbatchu.DATA;
import com.example.duoihinhbatchu.Object.CauDo;
import com.example.duoihinhbatchu.Object.NguoiDung;

import java.util.ArrayList;

public class ChoiGameModels {
    ChoiGameActivity c;
    ArrayList<CauDo> arr;
    public NguoiDung nguoiDung;
    int cauSo=-1;

    public ChoiGameModels(ChoiGameActivity c) {
        this.c = c;
        nguoiDung = new NguoiDung();
        taoData();
    }
    private void taoData(){
        arr = new ArrayList<>(DATA.getData().arrCauDo);
//        arr.add(new CauDo("","",""));
//        arr.add(new CauDo("Màn 1","xuatkhau","https://media.store123doc.com/figures/000/830/duoi-hinh-bat-chu-830362.png"));
//        arr.add(new CauDo("Màn 2","baocao","https://3.bp.blogspot.com/-pzQILmYu4Jw/U8ePEjoEW2I/AAAAAAAACq8/QN8KosNpR70/s1600/2014-07-17+00.43.58-1.png"));
//        arr.add(new CauDo("Màn 3","comat","https://cdn.lazi.vn/storage/uploads/dhbc/1478773660_Co_Mat.jpg"));
//        arr.add(new CauDo("Màn 4","nhatbao","https://cdn.lazi.vn/storage/uploads/dhbc/1466612832_nhat-bao.jpg"));
//        arr.add(new CauDo("Màn 5","noithat","https://files.vfo.vn/2014/T10/img/vforum.vn-133676-10262185-473271902807147-7738376419430735243-n.jpg"));
    }
    public CauDo layCauDo(){
        cauSo++;
        if(cauSo>=arr.size()){
            cauSo=arr.size()-1;
        }
        return arr.get(cauSo);
    }

    public void layThongTin(){
        nguoiDung.getTT(c);
    }
    public void luuThongTin(){
        nguoiDung.saveTT(c);
    }
}
