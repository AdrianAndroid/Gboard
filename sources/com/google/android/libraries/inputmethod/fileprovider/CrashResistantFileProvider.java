package com.google.android.libraries.inputmethod.fileprovider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Printer;
import androidx.core.content.FileProvider;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CrashResistantFileProvider extends FileProvider implements gzv {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/fileprovider/CrashResistantFileProvider");
    private final AtomicBoolean b = new AtomicBoolean(false);
    private String c;

    public CrashResistantFileProvider() {
        gzt.a.a(this);
    }

    public static boolean c(Context context, String str) {
        Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority(str).build(), "IS_INITIALIZED", (String) null, (Bundle) null);
        if (call == null) {
            return false;
        }
        return call.getBoolean("IS_INITIALIZED", false);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.c = providerInfo.authority;
        try {
            super.attachInfo(context, providerInfo);
            this.b.set(true);
        } catch (IllegalArgumentException e) {
            this.b.set(false);
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/fileprovider/CrashResistantFileProvider", "attachInfo", 'K', "CrashResistantFileProvider.java")).t("Failed to attachInfo");
        }
    }

    final boolean b() {
        return this.b.get();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        if ("IS_INITIALIZED".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("IS_INITIALIZED", b());
            return bundle2;
        }
        return super.call(str, str2, bundle);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (!b()) {
            return 0;
        }
        return super.delete(uri, str, strArr);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("authority = ".concat(String.valueOf(this.c)));
        boolean b = b();
        printer.println("initialized = " + b);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CrashResistantFileProvider";
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (!b()) {
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(String.valueOf(uri))));
        }
        return super.getType(uri);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!b()) {
            throw new FileNotFoundException("No files supported by provider at ".concat(String.valueOf(String.valueOf(uri))));
        }
        return super.openFile(uri, str);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!b()) {
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(String.valueOf(uri))));
        }
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        super.shutdown();
        this.b.set(false);
        this.c = null;
    }
}
