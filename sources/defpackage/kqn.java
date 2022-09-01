package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kqn {
    public static final void b(kqt kqtVar, HashMap hashMap) {
        jdg.u(kqc.a);
        jdg.A(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        hashMap.put("singleproc", kqtVar);
    }

    public static OutputStream c(kpy kpyVar, OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new kpa("wrapForAppend not supported by ".concat(kpyVar.a()));
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static final File e(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new koy("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new koy("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new koy("Did not expect uri to have authority");
    }

    public static final Uri f(Uri.Builder builder, llk llkVar) {
        return builder.encodedFragment(kpg.b(llkVar.g())).build();
    }

    public static final Uri g(String str, String str2, long j) {
        Uri.Builder path = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        if (kot.b(str) && !kot.a(str)) {
            path.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri build = path.build();
        List<String> pathSegments = build.getPathSegments();
        if (pathSegments.size() == 1) {
            String str3 = pathSegments.get(0);
            if (kot.a.k(str3).size() == 1 || (kot.b(str3) && !TextUtils.equals(str3, ".lease"))) {
                if (TextUtils.isEmpty(build.getQuery()) || (build.getQueryParameterNames().size() == 1 && build.getQueryParameter("expiryDateSecs") != null)) {
                    return build;
                }
                throw new koy(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", build.getQuery()));
            }
        }
        throw new koy(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", build.getPath()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final File h(Uri uri, Context context) {
        char c;
        File filesDir;
        if (!uri.getScheme().equals("android")) {
            throw new koy("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new koy(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (TextUtils.isEmpty(uri.getQuery())) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 94416770:
                    if (str.equals("cache")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 97434231:
                    if (str.equals("files")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 835260319:
                    if (str.equals("managed")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 991565957:
                    if (str.equals("directboot-files")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        filesDir = kki.e(context);
                    } else if (c == 3) {
                        filesDir = context.getCacheDir();
                    } else if (c == 4) {
                        File file = new File(kki.e(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                if (!kop.c(kop.a((String) arrayList.get(2)))) {
                                    throw new koy("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new koy(e);
                            }
                        }
                        filesDir = file;
                    } else if (c == 5) {
                        filesDir = context.getExternalFilesDir(null);
                    } else {
                        throw new koy(String.format("Path must start with a valid logical location: %s", uri));
                    }
                } else if (Build.VERSION.SDK_INT < 24) {
                    throw new koy(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                } else {
                    filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                }
            } else if (Build.VERSION.SDK_INT < 24) {
                throw new koy(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
            }
            return new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        }
        throw new koy("Did not expect uri to have query");
    }

    public static final kqi i(Executor executor, kcq kcqVar, HashMap hashMap, kqw kqwVar) {
        return new kqi(executor, kcqVar, kqwVar, hashMap, null, null, null);
    }
}
