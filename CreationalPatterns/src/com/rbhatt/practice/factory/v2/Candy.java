package com.rbhatt.practice.factory.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbhatt22 on 2/15/21.
 */
public abstract class Candy {

    abstract List<Candy> makeCandyPackage(int quantity);

}
