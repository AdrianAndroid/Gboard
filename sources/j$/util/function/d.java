package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ d(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Function function = this.c;
        Function function2 = this.b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
