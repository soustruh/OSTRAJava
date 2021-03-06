package cz.cvut.fit.ostrajava.Interpreter.Natives.Math;

import cz.cvut.fit.ostrajava.Interpreter.Memory.Heap;
import cz.cvut.fit.ostrajava.Interpreter.Natives.Native;
import cz.cvut.fit.ostrajava.Interpreter.StackValue;

/**
 * Created by tomaskohout on 11/26/15.
 */
public class LogInt extends Native {
    public LogInt(Heap heap) {
        super(heap);
    }

    @Override
    public StackValue invoke(StackValue[] args) {
        int value = args[0].intValue();
        int base = args[1].intValue();

        double res = Math.log(value) / Math.log(base);
        int resInt = (int) res;

        return new StackValue(resInt, StackValue.Type.Primitive);
    }
}
