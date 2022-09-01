package defpackage;

import android.content.Context;
import j$.nio.charset.StandardCharsets;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: PG */
/* renamed from: ikk  reason: default package */
/* loaded from: classes.dex */
public final class ikk {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryExportFileCreator");

    public static File a(Context context) {
        File file = new File(context.getCacheDir(), "personal-dictionary");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File b(Context context, ikf ikfVar, ijy ijyVar) {
        IOException e;
        File file;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        try {
            file = File.createTempFile("PersonalDictionary-", ".zip", a(context));
        } catch (IOException e2) {
            e = e2;
            file = null;
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        } catch (IOException e3) {
            e = e3;
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryExportFileCreator", "writeExportZipFile", '7', "PersonalDictionaryExportFileCreator.java")).t("Failed export personal dictionary.");
            return file;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(zipOutputStream, StandardCharsets.UTF_8);
            zipOutputStream.putNextEntry(new ZipEntry("dictionary.txt"));
            outputStreamWriter.write("# Gboard Dictionary version:");
            outputStreamWriter.write("1");
            outputStreamWriter.write(10);
            d(outputStreamWriter, ikfVar);
            if (ijyVar != null && ijyVar.getCount() > 0) {
                outputStreamWriter.write("# From OS\n");
                d(outputStreamWriter, ijyVar);
            }
            outputStreamWriter.close();
            zipOutputStream.close();
            bufferedOutputStream.close();
            fileOutputStream.close();
            return file;
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    public static void c(Context context) {
        jan.b.e(a(context));
    }

    private static void d(OutputStreamWriter outputStreamWriter, ijx ijxVar) {
        while (ijxVar.moveToNext()) {
            outputStreamWriter.write(String.format("%s\t%s\t%s\n", ijxVar.d(), ijxVar.e(), ijxVar.c()));
        }
    }
}
