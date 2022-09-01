package com.google.android.libraries.handwriting.classifiers;

import android.content.Context;
import android.util.Log;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LSTMRecognizerJNI extends gpr {
    FileInputStream b;
    FileInputStream c;
    FileInputStream d;
    protected final gpg e;

    public LSTMRecognizerJNI(gpg gpgVar, Context context) {
        Log.i("HWRLSTMRecoJNI", "Creating (settings, context): ".concat(toString()));
        this.e = gpgVar;
        String str = gpgVar.c;
        if (str != null) {
            String e = gqn.e(context, str);
            String e2 = gqn.e(context, gpgVar.d);
            String e3 = gqn.e(context, gpgVar.e);
            if (!new File(e).exists()) {
                throw new IOException(String.valueOf(e).concat(" does not exist."));
            }
            this.b = new FileInputStream(e);
            if (e2 != null) {
                this.c = new FileInputStream(e2);
            }
            if (e3 != null) {
                this.d = new FileInputStream(e3);
            }
            FileInputStream fileInputStream = this.b;
            FileInputStream fileInputStream2 = this.c;
            FileInputStream fileInputStream3 = this.d;
            long initJNIFromFileInputStreams = initJNIFromFileInputStreams(fileInputStream, 0L, FileInputStreamWrapper.getChannel(fileInputStream).size(), fileInputStream2, 0L, fileInputStream2 != null ? FileInputStreamWrapper.getChannel(fileInputStream2).size() : 0L, fileInputStream3, 0L, fileInputStream3 != null ? FileInputStreamWrapper.getChannel(fileInputStream3).size() : 0L);
            this.a = initJNIFromFileInputStreams;
            Log.i("HWRLSTMRecoJNI", "storage = " + initJNIFromFileInputStreams);
            if (this.a == 0) {
                throw new IOException("Couldn't initialize recognizer from ".concat(String.valueOf(e)));
            }
            return;
        }
        this.a = 0L;
        throw new IOException("Settings have neither a spec nor a file.");
    }

    public static void d(FileInputStream fileInputStream) {
        if (fileInputStream == null) {
            return;
        }
        try {
            fileInputStream.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            Log.e("HWRLSTMRecoJNI", e2.getMessage());
        }
    }

    @Override // defpackage.gpi
    public final gpg a() {
        return this.e;
    }

    @Override // defpackage.gpr
    public final void c() {
        String obj = toString();
        long j = this.a;
        Log.i("HWRRecoJNI", obj + ".destroy() storage: " + j);
        long j2 = this.a;
        if (j2 != 0) {
            deinitJNI(j2);
            this.a = 0L;
        }
        d(this.b);
        d(this.c);
        d(this.d);
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.gpr
    public native void deinitJNI(long j);

    protected native long initJNIFromFileInputStreams(FileInputStream fileInputStream, long j, long j2, FileInputStream fileInputStream2, long j3, long j4, FileInputStream fileInputStream3, long j5, long j6);

    @Override // defpackage.gpr
    protected native void recognizeJNI(long j, float[][][] fArr, int i, int i2, String str, String str2, HandwritingRecognizerJNI$JNIResult handwritingRecognizerJNI$JNIResult);
}
