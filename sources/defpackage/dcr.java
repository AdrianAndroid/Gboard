package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcr  reason: default package */
/* loaded from: classes.dex */
public final class dcr implements hpu {
    final /* synthetic */ dcu a;

    public dcr(dcu dcuVar) {
        this.a = dcuVar;
    }

    @Override // defpackage.hpu
    public final EditorInfo a() {
        return this.a.getCurrentInputEditorInfo();
    }

    @Override // defpackage.hpu
    public final InputConnection b() {
        return this.a.getCurrentInputConnection();
    }

    @Override // defpackage.hpu
    public final /* synthetic */ void c(hpt hptVar) {
    }

    @Override // defpackage.hpu
    public final /* synthetic */ void d() {
    }
}
