package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jso  reason: default package */
/* loaded from: classes.dex */
public final class jso implements Iterable {
    private final ArrayList a;

    public jso() {
        this.a = new ArrayList();
    }

    public final void a(Object obj, int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                i3 = -1;
                break;
            } else if (((lfc) this.a.get(i3)).a.equals(obj)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1) {
            if (((Integer) ((lfc) this.a.get(i3)).b).intValue() == i) {
                return;
            }
            this.a.remove(i3);
        }
        while (i2 < this.a.size() && ((Integer) ((lfc) this.a.get(i2)).b).intValue() <= i) {
            i2++;
        }
        this.a.add(i2, lfc.a(obj, Integer.valueOf(i)));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return lre.S(this.a.iterator(), jky.i);
    }

    public jso(jso jsoVar) {
        this.a = new ArrayList(jsoVar.a);
    }
}
