package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hjy  reason: default package */
/* loaded from: classes.dex */
public final class hjy extends hti {
    final /* synthetic */ hkb a;

    public hjy(hkb hkbVar) {
        this.a = hkbVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        htj htjVar = (htj) ijgVar;
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.c.keySet()) {
            hlf b = this.a.a.b(str);
            if (b != null && b.z == 1) {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.b((String) arrayList.get(i));
        }
    }
}
