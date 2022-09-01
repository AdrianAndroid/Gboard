package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: qa  reason: default package */
/* loaded from: classes2.dex */
public abstract class qa {
    public final Bundle a;

    /* JADX INFO: Access modifiers changed from: protected */
    public qa(Bundle bundle) {
        this.a = bundle;
    }

    protected abstract String a();

    public final void b() {
        if (this.a.getBoolean(a(), false)) {
            return;
        }
        throw new IllegalStateException("Invalid style, missing bundle key ".concat(a()));
    }
}
