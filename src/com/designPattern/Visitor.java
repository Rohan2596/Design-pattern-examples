package com.designPattern;

import com.designPattern.type.LargePackage;
import com.designPattern.type.MediumPackage;
import com.designPattern.type.SmallPackage;

public interface Visitor {

    public void visit(SmallPackage smallPackage);
    public void visit(MediumPackage mediumPackage);
    public void visit(LargePackage largePackage);

}
