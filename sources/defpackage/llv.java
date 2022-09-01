package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: llv  reason: default package */
/* loaded from: classes.dex */
public class llv implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public llv(llw llwVar) {
        Object[] objArr = new Object[llwVar.size()];
        Object[] objArr2 = new Object[llwVar.size()];
        lsz it = llwVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public lls a(int i) {
        return new lls(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof lmz)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.b;
            lls a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.a(objArr[i], objArr2[i]);
            }
            return a.l();
        }
        lmz lmzVar = (lmz) obj;
        lls a2 = a(lmzVar.size());
        lsz it = lmzVar.iterator();
        lsz it2 = ((llg) this.b).iterator();
        while (it.hasNext()) {
            a2.a(it.next(), it2.next());
        }
        return a2.l();
    }
}
