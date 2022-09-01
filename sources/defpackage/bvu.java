package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: bvu  reason: default package */
/* loaded from: classes.dex */
public final class bvu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils");
    private static final String[] d = {"_data"};
    public static final String[] b = {"_id"};
    public static final lmz c = lmz.v("jpg", "jpeg", "png", "gif", "webp");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Context context, Uri uri, long j, Bitmap.CompressFormat compressFormat) {
        File c2 = c(context, j, jbc.c(jbc.d(compressFormat)));
        if (!c2.exists()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(c2);
                try {
                    MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri).compress(compressFormat, 100, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "writeBitmapToFile", (char) 183, "ClipboardImageFileProviderUtils.java")).t("Error finding image output file.");
                return null;
            } catch (NullPointerException e2) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "writeBitmapToFile", 187, "ClipboardImageFileProviderUtils.java")).w("Failed to get the bitmap from uri %s", uri);
                return null;
            } catch (SecurityException e3) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "writeBitmapToFile", (char) 185, "ClipboardImageFileProviderUtils.java")).t("Permission Denial. Failed to read the image content.");
                return null;
            }
        }
        return n(context, c2);
    }

    public static Uri b(Context context, Uri uri, long j) {
        InputStream openInputStream;
        FileOutputStream fileOutputStream;
        String f;
        if (j(context)) {
            String b2 = jbc.b(uri);
            if (b2.isEmpty() && !k(context, uri) && (f = f(context, uri)) != null) {
                b2 = lwm.g(f);
            }
            if (b2.isEmpty()) {
                return a(context, uri, j, Bitmap.CompressFormat.JPEG);
            }
            File c2 = c(context, j, b2);
            if (!c2.exists()) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        fileOutputStream = new FileOutputStream(c2);
                    } catch (Throwable th) {
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "writeImageBytesToFile", (char) 168, "ClipboardImageFileProviderUtils.java")).t("Error finding image output file.");
                } catch (SecurityException e2) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "writeImageBytesToFile", (char) 170, "ClipboardImageFileProviderUtils.java")).t("Permission Denial. Failed to read the image content.");
                }
                if (openInputStream != null) {
                    lyp.b(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    openInputStream.close();
                } else {
                    fileOutputStream.close();
                    return null;
                }
            }
            return n(context, c2);
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "saveImageAndGetUri", 50, "ClipboardImageFileProviderUtils.java")).t("Failed to create clipboard image directory");
        return null;
    }

    public static File c(Context context, long j, String str) {
        File d2 = d(context);
        return new File(d2, j + "." + str);
    }

    static File d(Context context) {
        return new File(context.getApplicationContext().getFilesDir(), "clipboard_image");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File e(Context context, String str) {
        if (l(context, str)) {
            return new File(d(context), str.substring(str.lastIndexOf("/") + 1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, d, null, null, "date_added DESC");
            if (query == null || !query.moveToFirst()) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "getImagePath", 206, "ClipboardImageFileProviderUtils.java")).w("Failed to get path of the image %s.", uri);
                if (query == null) {
                    return null;
                }
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("_data"));
            query.close();
            return string;
        } catch (SQLiteException | IllegalStateException | SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "getImagePath", 209, "ClipboardImageFileProviderUtils.java")).w("Permission Denial. Failed to get data for the uri %s.", uri);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Context context, String str) {
        String f;
        Uri parse = Uri.parse(str);
        String e = jbc.e(parse);
        return (!e.isEmpty() || l(context, str) || (f = f(context, parse)) == null) ? e : jbc.f(new File(f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, String str) {
        File e = e(context, str);
        if (e != null && !e.delete()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "deleteImageFile", 120, "ClipboardImageFileProviderUtils.java")).w("Failed to delete image clip file %s", e);
        }
    }

    public static void i(Context context, long j, String str) {
        h(context, str);
        if (((Boolean) bwv.t.c()).booleanValue()) {
            lsz it = c.iterator();
            while (it.hasNext()) {
                File c2 = c(context, j, (String) it.next());
                if (c2.exists() && !c2.delete()) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "deleteImageFiles", 107, "ClipboardImageFileProviderUtils.java")).w("Failed to delete image clip file %s", c2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Context context) {
        return jan.b.h(d(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(Context context, Uri uri) {
        return l(context, uri.toString());
    }

    public static boolean l(Context context, String str) {
        return str.contains(context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str) {
        String X = jdg.X(str);
        return X.contains("screenshot") && !X.contains("pending");
    }

    private static Uri n(Context context, File file) {
        return FileProvider.a(context, jbt.w(context, ".fileprovider"), file);
    }
}
