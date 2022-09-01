package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: ehr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ehr implements gqs {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehr(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.gqs
    public final boolean a(EditorInfo editorInfo) {
        int i = this.b;
        if (i == 0) {
            return cuz.a.d(this.a, editorInfo);
        } else if (i != 1) {
            return cuz.a.d(this.a, editorInfo);
        } else {
            return cuz.a.d(this.a, editorInfo);
        }
    }
}
