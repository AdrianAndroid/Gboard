package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private azp d;

    public static Uri a(Context context, String str, File file) {
        String substring;
        azp b2 = b(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : ((HashMap) b2.a).entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
            }
            String path2 = ((File) entry.getValue()).getPath();
            if (path2.endsWith("/")) {
                substring = canonicalPath.substring(path2.length());
            } else {
                substring = canonicalPath.substring(path2.length() + 1);
            }
            return new Uri.Builder().scheme("content").authority((String) b2.b).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
        } catch (IOException unused) {
            new StringBuilder("Failed to resolve canonical path for ").append(file);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
        }
    }

    private static azp b(Context context, String str) {
        azp azpVar;
        HashMap hashMap = c;
        synchronized (hashMap) {
            azpVar = (azp) hashMap.get(str);
            if (azpVar == null) {
                try {
                    try {
                        azpVar = new azp(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (resolveContentProvider == null) {
                            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                        }
                        Bundle bundle = resolveContentProvider.metaData;
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData == null) {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        while (true) {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                c.put(str, azpVar);
                                break;
                            } else if (next == 2) {
                                String name = loadXmlMetaData.getName();
                                File file = null;
                                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    file = b;
                                } else if ("files-path".equals(name)) {
                                    file = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    file = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    file = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    File[] f = uv.f(context);
                                    if (f.length > 0) {
                                        file = f[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    File[] a2 = uq.a(context);
                                    if (a2.length > 0) {
                                        file = a2[0];
                                    }
                                } else if ("external-media-path".equals(name)) {
                                    File[] a3 = uw.a(context);
                                    if (a3.length > 0) {
                                        file = a3[0];
                                    }
                                }
                                if (file != null) {
                                    String[] strArr = {attributeValue2};
                                    for (int i = 0; i <= 0; i++) {
                                        String str2 = strArr[i];
                                        if (str2 != null) {
                                            file = new File(file, str2);
                                        }
                                    }
                                    if (!TextUtils.isEmpty(attributeValue)) {
                                        try {
                                            ((HashMap) azpVar.a).put(attributeValue, file.getCanonicalFile());
                                        } catch (IOException e) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Failed to resolve canonical path for ");
                                            sb.append(file);
                                            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file.toString()), e);
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Name must not be empty");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return azpVar;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap hashMap = c;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.d = b(context, str);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.l(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File l = this.d.l(uri);
        int lastIndexOf = l.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(l.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File l = this.d.l(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if (!"rwt".equals(str)) {
            throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
        } else {
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(l, i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File l = this.d.l(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? l.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(l.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
