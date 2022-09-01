package defpackage;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zz  reason: default package */
/* loaded from: classes2.dex */
public final class zz {
    public static yl a(View view, yl ylVar) {
        ContentInfo a = ylVar.a();
        ContentInfo performReceiveContent = view.performReceiveContent(a);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == a ? ylVar : yl.b(performReceiveContent);
    }

    public static void b(View view, String[] strArr, yz yzVar) {
        if (yzVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new aaa(yzVar));
        }
    }

    public static String[] c(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
