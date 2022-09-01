package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: fuk  reason: default package */
/* loaded from: classes.dex */
public final class fuk extends fuj {
    public fuk() {
        this.d = new ApplicationErrorReport();
        throw null;
    }

    @Override // defpackage.fuj
    public final ful a() {
        fyb.ax(this.d.crashInfo.exceptionClassName);
        fyb.ax(this.d.crashInfo.throwClassName);
        fyb.ax(this.d.crashInfo.throwMethodName);
        fyb.ax(this.d.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.d.crashInfo.throwFileName)) {
            this.d.crashInfo.throwFileName = "unknown";
        }
        ful a = super.a();
        a.d.crashInfo = this.d.crashInfo;
        a.g = null;
        return a;
    }

    public fuk(Throwable th) {
        this.d = new ApplicationErrorReport();
        this.d.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.d.crashInfo.throwLineNumber = -1;
        this.d.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
