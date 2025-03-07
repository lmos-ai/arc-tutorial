// SPDX-FileCopyrightText: 2025 Deutsche Telekom AG and others
//
// SPDX-License-Identifier: Apache-2.0

agent {
    name = "assistant-agent"
    prompt {
        val data = html("https://www.theregister.com/2025/03/07/eutelsat_starlink_ukraine/")
        """
       Your are a helpful assistant that can provide information and answer questions.
       
       Use the following data to answer: $data
      """
    }
}
