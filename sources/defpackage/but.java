package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: but  reason: default package */
/* loaded from: classes.dex */
final class but implements bwh {
    @Override // defpackage.bwh
    public final /* bridge */ /* synthetic */ List a(Context context, EditorInfo editorInfo, List list) {
        llp a = bus.a(context, editorInfo);
        llk e = llp.e();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buk bukVar = (buk) it.next();
            String i = bukVar.i();
            if (!hashSet.contains(i) && bus.b(a, i)) {
                e.h(bukVar);
                hashSet.add(i);
            }
        }
        return e.g();
    }
}
