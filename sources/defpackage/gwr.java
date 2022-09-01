package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner;

/* compiled from: PG */
/* renamed from: gwr  reason: default package */
/* loaded from: classes.dex */
public final class gwr implements ifw {
    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        isn a = iso.a("FILE CLEANING", AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner.class.getName());
        a.l = true;
        a.m = true;
        ism.a(context).c(a.a());
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
