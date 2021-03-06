/*
 * Copyright (c) 2017 Dmitry Avtonomov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package umich.ms.fileio;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.junit.Assert;
import org.junit.Test;
import umich.ms.msfiletoolbox.MsftbxInfo;

/**
 * @author Dmitry Avtonomov
 */
public class VersionStringTest {

  @Test
  public void VerifyVersionStringUpdatedBeforeRelease() throws Exception {

    System.out.println("Verifying version information");
    MavenXpp3Reader reader = new MavenXpp3Reader();
    Model pom = null;
    if (Files.exists(Paths.get("pom.xml"))) {
      pom = reader.read(new FileReader("pom.xml"));
    }
    if (pom == null) {
      System.err.println("Could not load pom.xml as Model");
      return;
    }
    System.out.printf("%nInfo in pom.xml:%n");
    System.out.printf("\tGroup Id: %s%n", pom.getGroupId());
    System.out.printf("\tArtifact Id: %s%n", pom.getArtifactId());
    System.out.printf("\tVersion: %s%n", pom.getVersion());
    System.out.printf("%nInfo in MsftbxInfo:%n");
    System.out.printf("\tVersion: %s%n", MsftbxInfo.getVersion());

    Assert.assertEquals("Version info in pom.xml does not match version info " +
        "returned by MsftbxInfo.getVersion()", pom.getVersion(), MsftbxInfo.getVersion());
  }
}
