package defpackage;

import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;

/* compiled from: PG */
/* renamed from: btr  reason: default package */
/* loaded from: classes.dex */
public final class btr implements dcv {
    final /* synthetic */ AbstractHmmChineseDecodeProcessor a;

    public btr(AbstractHmmChineseDecodeProcessor abstractHmmChineseDecodeProcessor) {
        this.a = abstractHmmChineseDecodeProcessor;
    }

    @Override // defpackage.dcv
    public final String a(String str) {
        obc obcVar = this.a.h;
        return obcVar != null ? obcVar.h(str) : str;
    }
}
