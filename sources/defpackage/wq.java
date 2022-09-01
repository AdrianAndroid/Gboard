package defpackage;

/* compiled from: PG */
/* renamed from: wq  reason: default package */
/* loaded from: classes2.dex */
public final class wq {
    public boolean a;
    public wp b;
    public boolean c;

    public final void a(wp wpVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b == wpVar) {
                return;
            }
            this.b = wpVar;
            if (this.a && wpVar != null) {
                wpVar.a();
            }
        }
    }
}
