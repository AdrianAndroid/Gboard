package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: bwe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bwe implements hld {
    private final /* synthetic */ int j;
    public static final /* synthetic */ bwe i = new bwe(8);
    public static final /* synthetic */ bwe h = new bwe(7);
    public static final /* synthetic */ bwe g = new bwe(6);
    public static final /* synthetic */ bwe f = new bwe(5);
    public static final /* synthetic */ bwe e = new bwe(4);
    public static final /* synthetic */ bwe d = new bwe(3);
    public static final /* synthetic */ bwe c = new bwe(2);
    public static final /* synthetic */ bwe b = new bwe(1);
    public static final /* synthetic */ bwe a = new bwe(0);

    private /* synthetic */ bwe(int i2) {
        this.j = i2;
    }

    @Override // defpackage.hld
    public final hlc a(View view) {
        switch (this.j) {
            case 0:
                return hlc.a(555, 0, 0);
            case 1:
                return hlc.a(587, 0, 0);
            case 2:
                return hlc.a(531, 0, 0);
            case 3:
                return hlc.a(19, 0, 0);
            case 4:
                return hlc.a(635, 0, 0);
            case 5:
                return hlc.a(635, 0, 0);
            case 6:
                return hlc.a(555, 0, 0);
            case 7:
                return hlc.a(635, 0, 0);
            default:
                return hlc.a(579, 0, 0);
        }
    }
}
