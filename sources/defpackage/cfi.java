package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfi  reason: default package */
/* loaded from: classes.dex */
final class cfi implements jtn {
    private final Context a;
    private final juc b;
    private final jan c;
    private final File d;
    private final idk e;

    public cfi(Context context, juc jucVar, jan janVar, File file, idk idkVar) {
        this.a = context;
        this.c = janVar;
        this.b = jucVar;
        this.d = file;
        this.e = idkVar;
    }

    @Override // defpackage.jtn
    /* renamed from: b */
    public final jtx a(jrr jrrVar) {
        ((luc) ((luc) cfj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightResourceMetadataFetcher$FetchManifestFromResourcesTask", "execute", 137, "SuperDelightResourceMetadataFetcher.java")).w("FetchManifestFromResourceTask#execute(): packManifest %s", this.b);
        jrrVar.a();
        cbd cbdVar = cbd.c;
        try {
            cbdVar.f.await();
        } catch (InterruptedException e) {
            ((ltd) ((ltd) cbd.a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "getBundledMetadataResourceId", 447, "FileLocationUtils.java")).t("thread interrupted");
        }
        try {
            InputStream openRawResource = this.a.getResources().openRawResource(cbdVar.d);
            File file = this.d;
            this.c.e(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        lyu.a().d(fileOutputStream);
                        boolean d = jan.d(openRawResource, Integer.MAX_VALUE, fileOutputStream);
                        gvt.a(openRawResource);
                        if (d) {
                            this.e.e(cap.SUPER_DELIGHT_BUNDLED_METADATA_FETCH, true, null);
                            return jtx.a("assets://".concat(String.valueOf(this.a.getApplicationInfo().sourceDir)));
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    ((ltd) ((ltd) ((ltd) jan.a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "copyStream", (char) 715, "FileOperationUtils.java")).t("Failed to copy stream");
                    gvt.a(openRawResource);
                }
            } catch (FileNotFoundException e3) {
                ((luc) ((luc) ((luc) cfj.a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightResourceMetadataFetcher$FetchManifestFromResourcesTask", "copy", 174, "SuperDelightResourceMetadataFetcher.java")).w("Failed to create file %s", file);
            }
            this.e.e(cap.SUPER_DELIGHT_BUNDLED_METADATA_FETCH, false, "CopyFailure");
            throw new IOException("Unable to copy metadata file");
        } catch (Resources.NotFoundException unused) {
            this.e.e(cap.SUPER_DELIGHT_BUNDLED_METADATA_FETCH, false, "ResourceNotFound");
            throw new FileNotFoundException(String.format(Locale.US, "Bundled file for %s not found", this.b));
        }
    }
}
