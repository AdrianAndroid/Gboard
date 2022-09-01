package defpackage;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kou  reason: default package */
/* loaded from: classes.dex */
public final class kou implements kpt {
    public kou() {
        new ConcurrentHashMap();
    }

    public kou(byte[] bArr) {
    }

    @Override // defpackage.kpt
    public final File d(Uri uri) {
        return kqn.e(uri);
    }

    @Override // defpackage.kpt
    public final InputStream e(Uri uri) {
        File e = kqn.e(uri);
        return new kpb(new FileInputStream(e), e);
    }

    @Override // defpackage.kpt
    public final String f() {
        return "file";
    }

    @Override // defpackage.kpt
    public final boolean g(Uri uri) {
        return kqn.e(uri).exists();
    }

    @Override // defpackage.kpt
    public final void i(Uri uri) {
        if (kqn.e(uri).mkdirs()) {
            return;
        }
        throw new IOException(String.format("%s could not be created", uri));
    }

    @Override // defpackage.kpt
    public final void j(Uri uri) {
        File e = kqn.e(uri);
        if (!e.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!e.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.kpt
    public final void k(Uri uri) {
        File e = kqn.e(uri);
        if (e.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (e.delete()) {
            return;
        }
        if (!e.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.kpt
    public final void l(Uri uri, Uri uri2) {
        File e = kqn.e(uri);
        File e2 = kqn.e(uri2);
        lwm.i(e2);
        if (e.renameTo(e2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override // defpackage.kpt
    public final boolean m(Uri uri) {
        return kqn.e(uri).isDirectory();
    }

    @Override // defpackage.kpt
    public final long p(Uri uri) {
        File e = kqn.e(uri);
        if (e.isDirectory()) {
            return 0L;
        }
        return e.length();
    }

    @Override // defpackage.kpt
    public final OutputStream q(Uri uri) {
        File e = kqn.e(uri);
        lwm.i(e);
        return new kpc(new FileOutputStream(e, true), e);
    }

    @Override // defpackage.kpt
    public final OutputStream r(Uri uri) {
        File e = kqn.e(uri);
        lwm.i(e);
        return new kpc(new FileOutputStream(e), e);
    }

    @Override // defpackage.kpt
    public final Iterable s(Uri uri) {
        File e = kqn.e(uri);
        if (!e.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] listFiles = e.listFiles();
        if (listFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            llk e2 = llp.e();
            path.path(absolutePath);
            arrayList.add(kqn.f(path, e2));
        }
        return arrayList;
    }
}
