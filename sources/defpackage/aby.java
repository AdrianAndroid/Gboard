package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* renamed from: aby  reason: default package */
/* loaded from: classes.dex */
public final class aby implements aca {
    final InputContentInfo a;

    public aby(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public aby(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // defpackage.aca
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.aca
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // defpackage.aca
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.aca
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.aca
    public final void e() {
        this.a.requestPermission();
    }
}
