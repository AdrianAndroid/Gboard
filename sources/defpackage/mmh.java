package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: mmh  reason: default package */
/* loaded from: classes2.dex */
public final class mmh implements fos {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.fos
    public final void a(boolean z) {
        synchronized (mmk.a) {
            Iterator it = new ArrayList(mmk.b.values()).iterator();
            while (it.hasNext()) {
                mmk mmkVar = (mmk) it.next();
                if (mmkVar.e.get()) {
                    for (opu opuVar : mmkVar.g) {
                        opuVar.b(z);
                    }
                }
            }
        }
    }
}
