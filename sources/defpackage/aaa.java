package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: aaa  reason: default package */
/* loaded from: classes.dex */
final class aaa implements OnReceiveContentListener {
    private final yz a;

    public aaa(yz yzVar) {
        this.a = yzVar;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        yl b = yl.b(contentInfo);
        yl a = this.a.a(view, b);
        if (a == null) {
            return null;
        }
        return a == b ? contentInfo : a.a();
    }
}
