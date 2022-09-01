package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: atb  reason: default package */
/* loaded from: classes.dex */
public final class atb implements ComponentCallbacks2 {
    private static volatile atb g;
    private static volatile boolean h;
    public final axp a;
    public final ath b;
    public final axn c;
    public final bdo d;
    public final List e = new ArrayList();
    public final cz f;
    private final ayh i;

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map, java.lang.Object] */
    public atb(Context context, kdr kdrVar, ayh ayhVar, axp axpVar, axn axnVar, bdo bdoVar, cz czVar, Map map, List list, List list2, bed bedVar, aqr aqrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        atj atjVar = atj.LOW;
        this.a = axpVar;
        this.c = axnVar;
        this.i = ayhVar;
        this.d = bdoVar;
        this.f = czVar;
        if (((ate) ((ati) aqrVar.a.get(ate.class))) != null) {
            bbk.c = 0;
        }
        this.b = new ath(context, axnVar, new atq(this, list2, bedVar), new dg(), map, list, kdrVar, aqrVar, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[Catch: all -> 0x01eb, LOOP:1: B:34:0x00b2->B:36:0x00b8, LOOP_END, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193 A[Catch: all -> 0x01eb, TryCatch #1 {, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:17:0x0077, B:19:0x0081, B:20:0x0089, B:22:0x008f, B:25:0x009f, B:32:0x00a6, B:33:0x00ac, B:34:0x00b2, B:36:0x00b8, B:39:0x00c4, B:40:0x00c7, B:42:0x00cb, B:43:0x00d5, B:45:0x00d9, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x0100, B:54:0x0104, B:55:0x010b, B:57:0x010f, B:59:0x0115, B:60:0x011e, B:61:0x0125, B:63:0x0129, B:64:0x0134, B:66:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x014f, B:72:0x0154, B:73:0x0188, B:75:0x018c, B:76:0x0199, B:77:0x0193, B:79:0x0032, B:81:0x0037, B:83:0x0049, B:84:0x0053, B:86:0x0059, B:89:0x006d, B:96:0x01d9, B:97:0x01e0, B:99:0x01e1, B:100:0x01e8, B:101:0x01e9), top: B:5:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.atb b(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.b(android.content.Context):atb");
    }

    public static atw c(Context context) {
        return h(context).d(context);
    }

    public static atw d(View view) {
        View view2;
        bdo h2 = h(view.getContext());
        if (bgj.n()) {
            return h2.d(view.getContext().getApplicationContext());
        }
        ce.m(view);
        ce.q(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a = bdo.a(view.getContext());
        if (a == null) {
            return h2.d(view.getContext().getApplicationContext());
        }
        Fragment fragment = null;
        an anVar = null;
        if (!(a instanceof ap)) {
            h2.d.clear();
            h2.i(a.getFragmentManager(), h2.d);
            View findViewById = a.findViewById(16908290);
            while (!view.equals(findViewById) && (fragment = (Fragment) h2.d.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            h2.d.clear();
            if (fragment == null) {
                return h2.c(a);
            }
            if (fragment.getActivity() == null) {
                throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
            }
            if (bgj.n()) {
                return h2.d(fragment.getActivity().getApplicationContext());
            }
            if (fragment.getActivity() != null) {
                h2.e.a(fragment.getActivity());
            }
            return h2.b(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
        ap apVar = (ap) a;
        h2.c.clear();
        bdo.j(apVar.hB().j(), h2.c);
        View findViewById2 = apVar.findViewById(16908290);
        while (!view.equals(findViewById2) && (anVar = (an) h2.c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        h2.c.clear();
        if (anVar != null) {
            ce.q(anVar.fS(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (bgj.n()) {
                return h2.d(anVar.fS().getApplicationContext());
            }
            if (anVar.B() != null) {
                h2.e.a(anVar.B());
            }
            bi D = anVar.D();
            Context fS = anVar.fS();
            boolean z = false;
            if (anVar.ai() && !anVar.aj() && (view2 = anVar.O) != null && view2.getWindowToken() != null && anVar.O.getVisibility() == 0) {
                z = true;
            }
            return h2.f(fS, D, anVar, z);
        }
        return h2.e(apVar);
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            i(e);
            return null;
        } catch (InstantiationException e2) {
            i(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            i(e3);
            return null;
        } catch (InvocationTargetException e4) {
            i(e4);
            return null;
        }
    }

    private static bdo h(Context context) {
        ce.q(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).d;
    }

    private static void i(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void e() {
        bgj.j();
        this.i.i();
        this.a.c();
        this.c.b();
    }

    public final void f(atj atjVar) {
        bgj.j();
        this.i.j(atjVar.d);
        this.a.e(atjVar.d);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        bgj.j();
        synchronized (this.e) {
            for (atw atwVar : this.e) {
            }
        }
        ayh ayhVar = this.i;
        if (i >= 40) {
            ayhVar.i();
        } else {
            if (i < 20) {
                if (i == 15) {
                    i = 15;
                }
            }
            ayhVar.k(ayhVar.e() / 2);
        }
        this.a.f(i);
        this.c.d(i);
    }
}
