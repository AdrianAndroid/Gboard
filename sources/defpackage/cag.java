package defpackage;

import j$.util.function.Supplier;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cag  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cag implements Supplier {
    private final /* synthetic */ int n;
    public static final /* synthetic */ cag m = new cag(12);
    public static final /* synthetic */ cag l = new cag(11);
    public static final /* synthetic */ cag k = new cag(10);
    public static final /* synthetic */ cag j = new cag(9);
    public static final /* synthetic */ cag i = new cag(8);
    public static final /* synthetic */ cag h = new cag(7);
    public static final /* synthetic */ cag g = new cag(6);
    public static final /* synthetic */ cag f = new cag(5);
    public static final /* synthetic */ cag e = new cag(4);
    public static final /* synthetic */ cag d = new cag(3);
    public static final /* synthetic */ cag c = new cag(2);
    public static final /* synthetic */ cag b = new cag(1);
    public static final /* synthetic */ cag a = new cag(0);

    private /* synthetic */ cag(int i2) {
        this.n = i2;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.n) {
            case 0:
                lug lugVar = caj.a;
                return gxp.a().f("DecoderWrapper", 0);
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return new ArrayList();
            case 4:
                return new ArrayList();
            case 5:
                return new ArrayList();
            case 6:
                return new ArrayList();
            case 7:
                return new ArrayList();
            case 8:
                return new ArrayList();
            case 9:
                return llp.e();
            case 10:
                return lmz.g();
            case 11:
                return lmw.e();
            default:
                return new lls();
        }
    }
}
