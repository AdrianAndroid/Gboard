package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: gbb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gbb implements gae {
    private final /* synthetic */ int e;
    public static final /* synthetic */ gbb d = new gbb(3);
    public static final /* synthetic */ gbb c = new gbb(2);
    public static final /* synthetic */ gbb b = new gbb(1);
    public static final /* synthetic */ gbb a = new gbb(0);

    private /* synthetic */ gbb(int i) {
        this.e = i;
    }

    @Override // defpackage.gae
    public final IInterface a(IBinder iBinder) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                return fzw.asInterface(iBinder);
            }
            return i != 2 ? gaz.asInterface(iBinder) : gat.asInterface(iBinder);
        }
        return gan.asInterface(iBinder);
    }
}
