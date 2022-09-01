package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buu  reason: default package */
/* loaded from: classes.dex */
public final class buu implements bwh {
    private static final lfy a = lfy.d(lej.b);

    @Override // defpackage.bwh
    public final /* bridge */ /* synthetic */ List a(Context context, EditorInfo editorInfo, List list) {
        llk e = llp.e();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buk bukVar = (buk) it.next();
            String i = bukVar.i();
            int c = bukVar.c();
            if (!hashSet.contains(i)) {
                if (ham.G(editorInfo) && c != 2) {
                    if (c == 0) {
                        for (String str : a.i(i)) {
                            if (xw.c.matcher(str).matches()) {
                                break;
                            }
                        }
                    }
                }
                if (!ham.I(editorInfo) || leb.a.j(i)) {
                    e.h(bukVar);
                    hashSet.add(i);
                }
            }
        }
        return e.g();
    }
}
