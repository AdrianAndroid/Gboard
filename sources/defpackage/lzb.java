package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lzb  reason: default package */
/* loaded from: classes.dex */
public final class lzb {
    private static final Map a = new HashMap();

    private lzb() {
    }

    public static synchronized void a(String str) {
        InputStream systemResourceAsStream;
        String str2;
        synchronized (lzb.class) {
            if (((String) a.get(str)) != null) {
                return;
            }
            if (lzb.class.getClassLoader() != null) {
                systemResourceAsStream = lzb.class.getClassLoader().getResourceAsStream(str);
            } else {
                systemResourceAsStream = ClassLoader.getSystemResourceAsStream(str);
            }
            if (systemResourceAsStream != null) {
                try {
                    String b = b(str);
                    String str3 = System.getProperty("java.io.tmpdir") + File.separator + System.currentTimeMillis() + "-";
                    for (int i = 1; i < 10000; i++) {
                        File file = new File(str3 + i);
                        if (file.mkdirs()) {
                            try {
                                File canonicalFile = file.getCanonicalFile();
                                canonicalFile.deleteOnExit();
                                File file2 = new File(canonicalFile, b);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = systemResourceAsStream.read(bArr);
                                        if (read != -1) {
                                            fileOutputStream.write(bArr, 0, read);
                                        } else {
                                            fileOutputStream.close();
                                            systemResourceAsStream.close();
                                            file2.deleteOnExit();
                                            e(str, file2);
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    systemResourceAsStream.close();
                                    throw th;
                                }
                            } catch (IOException unused) {
                                continue;
                            }
                        }
                    }
                    throw new AssertionError("Failed to create any usable temp directory between " + str3 + "1 and " + str3 + "9999, where java.io.tmpdir=" + System.getProperty("java.io.tmpdir") + ")");
                } catch (IOException e) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed while writing input stream to temp file '" + str + "': " + e.getMessage());
                    unsatisfiedLinkError.initCause(e);
                    throw unsatisfiedLinkError;
                }
            }
            String b2 = b(str);
            StringBuilder sb = new StringBuilder("Couldn't find classloader resource '" + str + "'");
            String c = c(str, sb);
            if (c == null) {
                String property = System.getProperty("os.name");
                if (property.equals("Mac OS X")) {
                    str2 = ".dylib";
                } else if (!property.equals("Linux")) {
                    throw new IllegalStateException("Don't know how to unmap library name in current platform (" + property + ")");
                } else {
                    str2 = ".so";
                }
                if (b2.length() > str2.length() + 3 && b2.startsWith("lib") && b2.endsWith(str2)) {
                    b2 = b2.substring(3, b2.length() - str2.length());
                }
                c = d(b2, str, sb);
            }
            if (c == null) {
                throw new UnsatisfiedLinkError(sb.toString());
            }
        }
    }

    private static String b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    private static String c(String str, StringBuilder sb) {
        try {
            System.load(str);
            a.put(str, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't load(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static String d(String str, String str2, StringBuilder sb) {
        try {
            System.loadLibrary(str);
            a.put(str2, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't loadLibrary(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static void e(String str, File file) {
        try {
            System.load(file.getPath());
            a.put(str, file.getPath());
            file.getPath();
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            String property = System.getProperty("sun.arch.data.model");
            if ((!message.contains("ELFCLASS64") || !"32".equals(property)) && (!message.contains("ELFCLASS32") || !"64".equals(property))) {
                throw e;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append(". If you built this binary from google3, then you need to use the flag --java_cpu=");
            sb.append(true != property.equals("32") ? "k8" : "piii");
            sb.append(".  Failure to do so may cause unpredictable and serious failures.");
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb.toString());
            unsatisfiedLinkError.setStackTrace(e.getStackTrace());
            throw unsatisfiedLinkError;
        }
    }
}
