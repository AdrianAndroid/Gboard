package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ogs  reason: default package */
/* loaded from: classes2.dex */
public final class ogs {
    static {
        Logger.getLogger(ogs.class.getName());
    }

    private ogs() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ohh ohhVar = (ohh) it.next();
            int i2 = i + 1;
            bArr[i] = ohhVar.f.n();
            i = i2 + 1;
            bArr[i2] = ohhVar.g.n();
        }
        return ofm.b(bArr);
    }
}
