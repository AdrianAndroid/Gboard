package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.inputmethod.libs.swissarmyknife.DecoderStateReportActivity;
import j$.nio.charset.StandardCharsets;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: epe  reason: default package */
/* loaded from: classes.dex */
public final class epe {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportEntrance");
    public static final hhl b = hhq.a("report_decoder_state_to_better_bug", false);
    public final Context c;
    public final dxe d;

    public epe(Context context, dxe dxeVar, byte[] bArr, byte[] bArr2) {
        this.c = context;
        this.d = dxeVar;
    }

    private final ClipData e(ClipData clipData, File file) {
        ClipData.Item item = new ClipData.Item(a(file));
        if (clipData == null) {
            return new ClipData("URIs", new String[]{"text/uri-list"}, item);
        }
        clipData.addItem(item);
        return clipData;
    }

    public final Uri a(File file) {
        Context applicationContext = this.c.getApplicationContext();
        return FileProvider.a(applicationContext, jbt.w(applicationContext, ".swissarmyknifefileprovider"), file);
    }

    public final File b(String str) {
        File file = new File(this.c.getCacheDir(), "swissarmyknife");
        if (file.exists() || file.mkdirs()) {
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath, str);
            jan.b.m(absolutePath, str);
            if (!file2.exists()) {
                throw new IOException(String.valueOf(file2.getAbsolutePath()).concat(" doesn't exist"));
            }
            return file2;
        }
        throw new IOException(String.format("Cannot create temporary directory \"%s\".", file.getAbsolutePath()));
    }

    public final File c(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                File b2 = b("gboard_dump.info");
                jan.b.k(str.getBytes(StandardCharsets.UTF_8), b2);
                return b2;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportEntrance", "fillDataToFile", 251, "QualityBugReportEntrance.java")).w("Error while dumping file object %s", "gboard_dump.info");
            }
        }
        return null;
    }

    public final void d(String str, File file, File file2) {
        Intent flags = new Intent(this.c, DecoderStateReportActivity.class).setFlags(276856832);
        if (file != null && !file.getName().isEmpty()) {
            flags.putExtra("state_report_description", str);
        }
        ClipData clipData = null;
        if (file != null) {
            clipData = e(null, file);
        }
        if (file2 != null) {
            clipData = e(clipData, file2);
        }
        if (clipData != null) {
            flags.setClipData(clipData);
        }
        if (!this.c.getPackageManager().queryIntentActivities(flags, 0).isEmpty()) {
            this.c.startActivity(flags);
        }
    }
}
