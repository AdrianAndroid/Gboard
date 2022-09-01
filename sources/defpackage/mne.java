package defpackage;

/* compiled from: PG */
/* renamed from: mne  reason: default package */
/* loaded from: classes2.dex */
public final class mne implements moi {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile moi c;

    public mne(moi moiVar) {
        this.c = moiVar;
    }

    @Override // defpackage.moi
    public final Object a() {
        Object obj = this.b;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.c.a();
                    this.b = obj;
                    this.c = null;
                }
            }
        }
        return obj;
    }
}
