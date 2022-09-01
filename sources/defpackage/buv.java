package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: buv  reason: default package */
/* loaded from: classes.dex */
final class buv implements bwh {
    private final lmz a;

    public buv(lmz lmzVar) {
        this.a = lmzVar;
    }

    @Override // defpackage.bwh
    public final /* bridge */ /* synthetic */ List a(Context context, EditorInfo editorInfo, List list) {
        llp a = bus.a(context, editorInfo);
        llk e = llp.e();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buk bukVar = (buk) it.next();
            String i = bukVar.i();
            if (!hashSet.contains(i) && this.a.contains(Integer.valueOf(bukVar.c())) && bus.b(a, i)) {
                e.h(bukVar);
                hashSet.add(i);
            }
        }
        return e.g();
    }
}
