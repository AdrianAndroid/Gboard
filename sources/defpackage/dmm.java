package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dmm  reason: default package */
/* loaded from: classes.dex */
final class dmm extends hqo {
    final /* synthetic */ dmn a;

    public dmm(dmn dmnVar) {
        this.a = dmnVar;
    }

    @Override // defpackage.hqo
    public final void a(hqt hqtVar) {
        dmn dmnVar = this.a;
        hsk b = hsx.b();
        if (b == null) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(dmn.c(hqtVar.i()));
        lsz it = hqtVar.k().iterator();
        while (it.hasNext()) {
            arrayList.add(dmn.c((jav) it.next()));
        }
        if (arrayList.equals(dmnVar.c)) {
            return;
        }
        dmnVar.c = arrayList;
        dmnVar.b.clear();
        dmnVar.b.putStringArrayList("CurrentKeyboardLanguages", arrayList);
        b.Q().a("onKeyboardUpdated", dmnVar.b);
    }
}
