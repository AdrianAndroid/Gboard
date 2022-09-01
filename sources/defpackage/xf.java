package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: xf  reason: default package */
/* loaded from: classes2.dex */
public final class xf implements xt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xf(azp azpVar, int i, byte[] bArr) {
        this.b = i;
        this.a = azpVar;
    }

    public xf(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.xt
    public final /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            synchronized (xg.c) {
                ArrayList arrayList = (ArrayList) xg.d.get(this.a);
                if (arrayList == null) {
                    return;
                }
                xg.d.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((xt) arrayList.get(i)).a(obj);
                }
                return;
            }
        }
        if (obj == null) {
            obj = new krm(-3);
        }
        ((azp) this.a).G((krm) obj);
    }
}
