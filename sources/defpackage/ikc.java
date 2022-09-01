package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ikc  reason: default package */
/* loaded from: classes.dex */
public final class ikc implements gvl, ifw {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryBackupDataProviderModule");
    private final Context b;

    public ikc(Context context) {
        this.b = context;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "personal_dictionary";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "personal_dictionary";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        ikk.c(this.b);
        Context context = this.b;
        ikh ikhVar = new ikh();
        try {
            ikf c = ikhVar.c();
            File b = ikk.b(context, c, null);
            c.close();
            ikhVar.close();
            if (b == null) {
                return;
            }
            gvkVar.b("personal_dictionary", b.getName(), b);
        } catch (Throwable th) {
            try {
                ikhVar.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        ikh ikhVar = new ikh();
        int i = iko.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            try {
                FileInputStream fileInputStream = new FileInputStream((File) entry.getValue());
                iko.a(fileInputStream, ikhVar);
                arrayList.add((String) entry.getKey());
                fileInputStream.close();
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryBackupDataProviderModule", "restoreFiles", ';', "PersonalDictionaryBackupDataProviderModule.java")).t("Failed export personal dictionary.");
            }
        }
        return arrayList;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
